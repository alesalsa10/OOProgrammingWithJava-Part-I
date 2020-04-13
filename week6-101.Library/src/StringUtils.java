/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
import java.util.*;


public class StringUtils {    


    public StringUtils() {    

    }

    public static boolean included(String word, String searched) {
        if (word == null || searched == null || word.isEmpty() || searched.isEmpty()) {
            return false;
        }

        word = word.trim().toUpperCase();
        searched = searched.trim().toUpperCase();

        if (word.contains(searched)) {
            return true;
        } else {
            return false;
        }
    }
}
