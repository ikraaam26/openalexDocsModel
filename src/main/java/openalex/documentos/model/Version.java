/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openalex.documentos.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author practicas
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@CompoundIndex(name = "identificador", def = "{'documento.id' : 1}", unique = true)
@Document(collection = "versiones_v3")
public class Version implements Serializable{
    
    @Id
    private String id;
    
    private ContentDocumento content;
    
    @org.springframework.data.mongodb.core.mapping.Field("documentoId")
    private String documentoId; 

    public Version(ContentDocumento content, String documentoId) {
        this.content = content;
        this.documentoId = documentoId;
    }
    
    
}
