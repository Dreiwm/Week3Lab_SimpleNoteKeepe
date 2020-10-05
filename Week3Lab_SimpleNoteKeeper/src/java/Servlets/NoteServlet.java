/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Models.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chris
 */
public class NoteServlet extends HttpServlet {
    private Note note;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      String path = getServletContext().getRealPath("/WEB-INF/note.txt");
      BufferedReader br = new BufferedReader(new FileReader(new File(path)));
      String title = br.readLine();
      String content = br.readLine();
      
      this.note = new Note(title,content);
      request.setAttribute("note",note);  
      
      getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
       
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        pw.println(title);
        pw.println(content);
        
        note.setContent(content);
        note.setTitle(title);
        request.setAttribute("note", note);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }


}
