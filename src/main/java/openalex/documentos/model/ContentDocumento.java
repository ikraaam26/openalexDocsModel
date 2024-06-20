/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openalex.documentos.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
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
public class ContentDocumento {
  
    private List<Identificador> identificadores = new ArrayList<>();
   
}
