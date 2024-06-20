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

/**
 *
 * @author practicas
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Topic {
    @org.springframework.data.mongodb.core.mapping.Field("id")
    private String id;
    @org.springframework.data.mongodb.core.mapping.Field("display_name")
    private String displayName;
    private double score;
    private Subfield subfield;
    private Field field;
    private Domain domain;

}
