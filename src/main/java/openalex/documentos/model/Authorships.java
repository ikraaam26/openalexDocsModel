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
public class Authorships {

    @Field("author_position")
    private String authorPosition;
    private Author author;
    private ArrayList<Institution> institutions = new ArrayList<>();
    private ArrayList<String> countries = new ArrayList<>();
    @Field("is_corresponding")
    private boolean isCorresponding;
    @Field("raw_author_name")
    private String rawAuthorName;
    @Field("raw_affiliation_string")
    private String rawAffiliationString;
    @Field("raw_affiliation_strings")
    private ArrayList<String> rawAffiliationStrings = new ArrayList<>();

}
