/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openalex.documentos.model;

import java.util.ArrayList;
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
public class Institution {

    @Field("id")
    private String id;
    @Field("display_name")
    private String displayName;
    private String ror;
    @Field("country_code")
    private String countryCode;
    private String type;
    private ArrayList<String> lineage = new ArrayList <String> ();

}
