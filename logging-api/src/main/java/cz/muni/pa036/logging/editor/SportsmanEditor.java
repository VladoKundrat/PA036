package cz.muni.pa036.logging.editor;

import cz.muni.pa036.logging.dto.SportsmanDTO;
import cz.muni.pa036.logging.facade.SportsmanFacade;

import java.beans.PropertyEditorSupport;

/**
 * @author Vit Hovezak
 */
public class SportsmanEditor extends PropertyEditorSupport {

    private final SportsmanFacade sportsmanFacade;

    public SportsmanEditor(SportsmanFacade sportsmanFacade) {
        this.sportsmanFacade = sportsmanFacade;
    }

    public void setAsText(String value) {
        if (value.equals("")) {
            setValue(null);
            return;
        }
        setValue(sportsmanFacade.getById(Long.valueOf(value)));
    }

    public String getAsText() {
        SportsmanDTO sportsmanDTO = (SportsmanDTO) this.getValue();
        if (sportsmanDTO == null) {
            return "";
        }
        return String.valueOf(sportsmanDTO.getId());
    }

}
