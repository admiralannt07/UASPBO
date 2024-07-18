/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uaspbo_annt07;

import com.mycompany.uaspbo_annt07.db.NoteAppMenu;


/**
 *2
 * @author budi
 */
public class Main{

    public static void main(String[] args) {
        NoteAppMenu noteapp = new NoteAppMenu("notes.db");
        noteapp.start();
    }
}
