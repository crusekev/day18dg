package kevincruse;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fWriter = new FileWriter("mydata.html");
        PrintWriter outfile = new PrintWriter(fWriter);
        outfile.println("<!DOCTYPE html>");
        outfile.println("<html>");
        outfile.println("<head>");
        outfile.println("<title>Page Title</title>");
        outfile.println("</head>");
        outfile.println("<body>");
        outfile.println("<h1>This is a Heading</h1>");
        outfile.println("<p>This is a paragraph.</p>");
        outfile.println("<table style='border: 1px solid black;'>");
        for (int r = 1; r <= 10; r++) {
            outfile.println("<tr>");
            outfile.println("<td>" + r + "</td>");
            outfile.println("<td>" + r * r + "</td>");
            outfile.println("<td>" + r * r * r + "</td>");
            outfile.println("<td>" + r * r * r * r + "</td>");
            outfile.println("</tr>");
        }
        outfile.println("</table>");
        outfile.println("</body>");
        outfile.println("</html>");
        outfile.close();
        //hw where 94 is print scores array row r sub coloumn 2
    }
}