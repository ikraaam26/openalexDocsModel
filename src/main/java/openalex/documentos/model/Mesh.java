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
public class Mesh {
    
    @Field("descriptor_ui")
    private String descriptorUi;
    @Field("descriptor_name")
    private String descriptorName;
    @Field("qualifier_ui")
    private String qualifierUi;
    @Field("qualifier_name")
    private String qualifierName;
    @Field("is_major_topic")
    private boolean isMajorTopic;

       
}
