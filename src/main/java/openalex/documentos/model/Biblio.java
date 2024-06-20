/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openalex.documentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author practicas
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Biblio {
    
    private String volume;
    private String issue;
    @Field("fist_page")
    private String fistPage;
    @Field("last_page")
    private String lastPage;

}