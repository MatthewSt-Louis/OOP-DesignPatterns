/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

import dataaccesslayer.TutorDAO;
import dataaccesslayer.TutorDAOImpl;
import transferobjects.TutorDTO;

/**
 *
 * @author Matthew
 */
public class TutorBL {
    
    private TutorDAO t = null;
    
    public TutorBL(){
        t = new TutorDAOImpl();
    }
    
    public boolean checkTutorGrade(TutorDTO t){
        return this.t.checkGrade(t);   
    }
    
}
