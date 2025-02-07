<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina di Esempio</title>
    
    <!-- Collegamento a fogli di stile CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stile.css">
    
</head>

<body>

<!-- Header della pagina -->
<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <!-- Menu di navigazione -->
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item active"><a class="nav-link" href="#">Home</a></li>
            <!-- Altri link del menu -->
        </ul>
        
        <!-- Eventuali altre opzioni nel header -->
        
    </nav> 
</header>

<!-- Sezione principale del contenuto -->
<main role='main'>
    
    <%-- Includi eventuali messaggi o alert --%>
    
    <% if (request.getAttribute("messaggio") != null) { %>
        <div class='alert alert-info'>${messaggio}</div>  
    <% } %>

    
     <!-- Contenuto specifico della pagina --> 
     ${contenutoPagina}
     
     <%-- Oppure inserisci direttamente il codice JSP qui --%>

</main>

<!-- Footer della pagina -->
<footer id='footer' style='position: fixed; bottom: 0; width:100%; background-color: #f5f5f5;' >
   &copy; 2023 - Tutti i diritti riservati.
   
   <!-- Link a pagine aggiuntive nel footer, come "Contatti", "FAQ", ecc.-->
   
</footer> 

<!-- Script JavaScript da caricare alla fine per migliorare la performance della pagina -->
<script src="${pageContext.request.contextPath}/js/script.js"></script>

</body>

</html> 
