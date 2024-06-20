/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openalex.documentos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;


import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *source de primarylocation
 * @author practicas
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Source {

    @Field("id")
    private String id;
    @Field("display_name")
    private String displayName;
    @Field("issn_l")
    private String issnL;
    private ArrayList<String> issn = new ArrayList <String> ();
    @Field("is_oa")
    private boolean isOa;
    @Field("is_in_doaj")
    private boolean isInDoaj;
    @Field("host_organization")
    private String hostOrganization;
    @Field("host_organization_name")
    private String hostOrganizationName;
    @Field("host_organization_lineage")
    private ArrayList <String> hostOrganizationLineage = new ArrayList <String> ();
    @Field("host_organization_lineage_names")
    private ArrayList <String> hostOrganizationLineageNames = new ArrayList <String> ();
    private String type;

}
