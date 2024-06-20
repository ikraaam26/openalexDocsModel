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
public class OpenAccess {

    @Field("is_oa")
    private boolean isOa;
    @Field("oa_status")
    private String oaStatus;
    @Field("oa_url")
    private String oaUrl;
    @Field("any_repository_has_fulltext")
    private boolean anyRepositoryHasFulltext;

    public boolean getIsOa() {
        return isOa;
    }
}
