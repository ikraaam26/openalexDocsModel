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
public class Location {

    @Field("is_oa")
    private boolean isOa;
    @Field("landing_page_url")
    private String landingPageUrl;
    @Field("pdf_url")
    private String pdfUrl;
    private Source source;
    private String license;
    private String version;
    @Field("is_accepted")
    private boolean isAccepted;
    @Field("is_published")
    private boolean isPublished;

    public boolean isIsOa() {
        return isOa;
    }

    public void setIsOa(boolean isOa) {
        this.isOa = isOa;
    }

    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public boolean isIsPublished() {
        return isPublished;
    }

    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }
    
    

}
