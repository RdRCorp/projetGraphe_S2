/*
 * ia d'abigail
 */
package stardewvalleyautomaton.Model.Personnages.IA;

import java.util.Random;
import static stardewvalleyautomaton.Model.Personnages.IA.Enum_Action.*;

/**
 *
 * @author simonetma
 */
public class IA_Abigail extends IA {
    
    @Override
    protected void setActionValide() {
        this.addActionValide(attendre);
        this.addActionValide(moveLeft);
        this.addActionValide(moveRight);
        this.addActionValide(moveTop);
        this.addActionValide(moveBottom);
        this.addActionValide(traire);
        this.addActionValide(produireFromage);
        this.addActionValide(collecterOeuf);
    }
    
    //IA D'ABIGAIL (A IMPLEMENTER) ---------------------------------------------
    @Override
    public Enum_Action action() {
        return attendre;
    }

    
    
}
