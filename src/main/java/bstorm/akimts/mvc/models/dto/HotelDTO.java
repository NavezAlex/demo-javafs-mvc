package bstorm.akimts.mvc.models.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class HotelDTO {

    private long id;
    private String nom;
    private String adresse;
    private int nbrEtoiles;
    private List<ChambreDTO> chambres;

}
