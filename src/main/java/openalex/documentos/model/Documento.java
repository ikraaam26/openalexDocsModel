/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openalex.documentos.model;

import org.springframework.data.mongodb.core.mapping.Field;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Value;


/**
 *
 * @author practicas
 */

//@Data
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Documento {

    @Field("id")
    private String id;
    private String doi;
    private String title;
    @Field("display_name")
    private String displayName;
    @Field("publication_year")
    private int publicationYear;
    @Field("publication_date")
    private String publicationDate;
    private Ids ids;
    private String language;
    @Field("primary_location")
    private Location primaryLocation;
    private String type;
    @Field("type_crossref")
    private String typeCrossref;
    @Field("indexed_in")
    private ArrayList<String> indexedIn = new ArrayList<>();
    @Field("open_access")
    private OpenAccess openAccess;
    private ArrayList<Authorships> authorships = new ArrayList<>();
    @Field("countries_distinct_count")
    private int countriesDistinctCount;
    @Field("institutions_distinct_count")
    private int institutionsDistinctCount;
    @Field("corresponding_author_ids")
    private ArrayList<String> correspondingAuthorIds = new ArrayList<>();
    @Field("corresponding_institution_ids")
    private ArrayList<String> correspondingInstitutionIds = new ArrayList<>();
    @Field("apc_list")
    private Apc apcList;
    @Field("apc_paid")
    private Apc apcPaid;
    @Field("has_fulltext")
    private boolean hasFulltext;
    @Field("fulltext_origin")
    private String fulltextOrigin;
    @Field("cited_by_count")
    private float citedByCount;
    @Field("cited_by_percentile_year")
    private CitedByPercentileYear citedByPercentileYear;
    private Biblio biblio;
    @Field("is_retracted")
    private boolean isRetracted;
    @Field("is_paratext")
    private boolean isParatext;
    @Field("primary_topic")
    private PrimaryTopic primaryTopic;
    private ArrayList<Topic> topics = new ArrayList<>();
    private ArrayList<Keyword> keywords = new ArrayList<>();
    private ArrayList<Concept> concepts = new ArrayList<>();
    private ArrayList<Mesh> mesh = new ArrayList<>();
    @Field("locations_count")
    private float locationsCount;
    private ArrayList<Location> locations = new ArrayList<>();
    @Field("best_oa_location")
    private Location bestOaLocation;
    @Field("sustainable_development_goals")
    private ArrayList<SustainableDevelopmentGoals> sustainableDevelopmentGoals = new ArrayList<>();
    private ArrayList<Grant> grants = new ArrayList<>();
    private ArrayList<Object> datasets = new ArrayList<>();
    private ArrayList<Object> versions = new ArrayList<>();
    @Field("referenced_works_count")
    private float referencedWorksCount;
    @Field("referenced_works")
    private ArrayList<String> referencedWorks = new ArrayList<>();
    @Field("related_works")
    private ArrayList<String> relatedWorks = new ArrayList<>();
    @Field("ngrams_url")
    private String ngramsUrl;
    @Field("abstract_inverted_index")
    private String abstractInvertedIndex;
    @Field("cited_by_api_url")
    private String citedByApiUrl;
    @Field("counts_by_year")
    private ArrayList<CountsByYear> countsByYear = new ArrayList<>();
    @Field("updated_date")
    private String updatedDate;
    @Field("created_date")
    private String createdDate;

}
