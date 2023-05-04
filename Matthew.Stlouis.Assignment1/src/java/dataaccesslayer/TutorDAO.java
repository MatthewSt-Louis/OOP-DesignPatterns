/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dataaccesslayer;

import java.util.List;
import transferobjects.TutorDTO;

/**
 *
 * @author Matthew
 */
public interface TutorDAO {
    
    List<TutorDTO> getAllTutors(Integer courseCode);
    boolean checkGrade(TutorDTO t);
    void addTutor(TutorDTO t);
}
