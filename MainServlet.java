/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sekai Blog</title>");
            out.println("<style>");
            out.println("@import url('https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;700&display=swap');");
            out.println("body { margin: 0; font-family: 'Playfair Display', serif; background-color: #f3f3f3; color: #333; }");
            out.println(".header { background-color: #ffffff; padding: 20px; text-align: center; }");
            out.println(".header h1 { margin: 0; font-size: 36px; color: #333; }");
            out.println(".nav { display: flex; justify-content: center; background-color: #333; }");
            out.println(".nav a { padding: 14px 20px; text-decoration: none; color: white; }");
            out.println(".nav a:hover { background-color: #575757; }");
            out.println(".banner { position: relative; text-align: center; color: white; margin-bottom: 40px; }");
            out.println(".banner img { width: 100%; height: 500px; opacity: 0.7; }");
            out.println(".banner .text { position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); }");
            out.println(".banner h2 { font-size: 50px; }");
            out.println(".content-section { display: flex; justify-content: space-around; text-align: center; margin-bottom: 100px; }");
            out.println(".content-box { background-color: #fff; border-radius: 15px; padding: 15px; width: 25%; box-shadow: 0 4px 8px rgba(0,0,0,0.1); }");
            out.println(".content-box h3 { font-size: 20px; font-weight: 400; margin-bottom: 5px; }");
            out.println(".content-box h4 { font-size: 30px; font-weight: 700; margin-bottom: 20px; }");
            out.println(".content-box p { font-size: 12px; color: #999; }");
            out.println(".container { display: flex; justify-content: center; align-items: center; height: auto; margin-bottom: 40px; }");
            out.println(".box { display: flex; padding: 0; margin-top: 20px; }");
            out.println(".box img { max-width: 350px; border-radius: 0; margin-right: 20px; }");
            out.println(".box .content { text-align: left; }");
            out.println(".content h2 { font-size: 36px; margin-bottom: 10px; font-weight: 700; color: #333; }");
            out.println(".content p { font-size: 16px; margin-bottom: 20px; }");
            out.println(".btn { padding: 10px 20px; border: 1px solid #333; background-color: #f3f3f3; color: #333; font-size: 14px; text-decoration: none; }");
            out.println(".btn:hover { background-color: #333; color: white; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");

            // Header
            out.println("<div class='header'>");
            out.println("<h1>Sekai Blog</h1>");
            out.println("</div>");

            // Navigation
            out.println("<div class='nav'>");
            out.println("<a href='#'>HOME</a>");
            out.println("<a href='#'>XXXX</a>");
            out.println("<a href='#'>XXXX</a>");
            out.println("<a href='#'>XXXX</a>");
            out.println("<a href='#'>XXXX</a>");
            out.println("<a href='#'>XXXX</a>");
            out.println("<a href='#'>XXXX</a>");
            out.println("</div>");

            // Banner
            out.println("<div class='banner'>");
            out.println("<img src='https://i.pinimg.com/564x/bc/81/81/bc818171e6dcb42cf9f46278b83a7621.jpg' alt='Banner Image'>");
            out.println("<div class='text'>");
            out.println("<h2>WELCOME TO SEKAI BLOG</h2>");
            out.println("</div>");
            out.println("</div>");

            // Content Section
            out.println("<div class='content-section'>");
            out.println("<div class='content-box'>");
            out.println("<h3>BRANDING TIPS</h3>");
            out.println("<h4>THE IMPORTANCE OF LOGO VARIANTS</h4>");
            out.println("<p>THE IMPORTANCE LOGO VARIANTS</p>");
            out.println("</div>");
            out.println("<div class='content-box'>");
            out.println("<h3>FONTS</h3>");
            out.println("<h4>NEW FONTS FOR 2024</h4>");
            out.println("<p>NEW FONTS FOR 2024</p>");
            out.println("</div>");
            out.println("<div class='content-box'>");
            out.println("<h3>BUSINESS</h3>");
            out.println("<h4>4 BUSINESS RESOURCES I'M BRINGING INTO 2024</h4>");
            out.println("<p>4 BUSINESS RESOURCES I'M BRINGING INTO 2024</p>");
            out.println("</div>");
            out.println("</div>");

            // New Content Box (Website Launch Checklist)
            out.println("<div class='container'>");
            out.println("<div class='box'>");
            out.println("<img src='https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSLTSKspwDaHudBKlPEfBaLrRXJ82NeTmtHW06NV8A5JKVSctf4' alt='Website Launch Checklist'>");
            out.println("<div class='content'>");
            out.println("<p style='font-size: 12px; letter-spacing: 2px; color: #888;'>FREE DOWNLOAD</p>");
            out.println("<h2>WEBSITE LAUNCH CHECKLIST</h2>");
            out.println("<p>Download the free website launch checklist! Make sure your website is ready to go!</p>");
            out.println("<a href='#' class='btn'>GET THE CHECKLIST</a>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            
            

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Sekai Blog Header with Content Section";
    }
}
