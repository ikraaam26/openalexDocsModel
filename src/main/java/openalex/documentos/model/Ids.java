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
public class Ids {
    private String openalex;
    private String doi;
    private String mag;
    private String pmid;
    private String pmcid;

}
