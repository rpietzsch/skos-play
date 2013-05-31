<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="fr.sparna.rdf.skosplay.SessionData" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" 	prefix="fmt" 	%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 	prefix="c" 		%>

<!-- setup the locale for the messages based on the language of the request -->
<fmt:setLocale value="${pageContext.request.locale.language}"/>
<fmt:setBundle basename="fr.sparna.rdf.skosplay.i18n.Bundle"/>

<html>
	<head>
		<title>SKOS Play ! - Visualize SKOS data</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
		<link href="bootstrap-fileupload/bootstrap-fileupload.min.css" rel="stylesheet" />
		<link href="css/skos-play.css" rel="stylesheet" />
		<script src="js/jquery.min.js"></script>
		<script src="bootstrap-fileupload/bootstrap-fileupload.min.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="page-header">
				<div class="row">
			    	<div class="span6"><h1>SKOS Play !</h1></div>
			    	<div class="span6">
			    		<ul class="nav nav-pills pull-right">
			    			<li class="active"><a href="home"><fmt:message key="menu.home" /></a></li>
			    			<li><a href="upload.jsp"><fmt:message key="menu.start" /></a></li>
					    	<li><a href="about"><fmt:message key="menu.about" /></a></li>
					    	<li><a href="http://www.google.com/moderator/#15/e=209fff&t=209fff.40" target="_blank"><fmt:message key="menu.feedback" /></a></li>
					    </ul>
					</div>
			    </div>	      		
	      	</div>
			<div style="font-size:1.6em; line-height: 1.3em; text-align:justify;" class="span10 offset1">
				<p>
				SKOS Play is a free application to render and visualise thesaurus, taxonomies or controlled vocabularies expressed in 
				<a href="http://www.w3.org/TR/2009/REC-skos-reference-20090818/" target="_blank">SKOS</a>.
				</p>
				<p>
				With SKOS Play you can print Knowledge Organization Systems that use the SKOS data model in HTML or PDF documents, and
				visualize them in graphical representations.
				</p>
				<p>
				SKOS Play is intended to demonstrate some of the possibilities of enterprise vocabularies usage and web of data
				technologies.
				</p>
				<br />
				<br />
				<div style="text-align:center">
                  	<a href="upload.jsp"><button class="btn btn-large btn-success">Start Here</button></a>
                  	<a href="about"><button class="btn btn-large" type="button">Learn More</button></a>                
              </div>
			</div>
      	</div>
      	<footer>
      	SKOS Play! by <a href="http://francart.fr" target="_blank">Thomas Francart</a> for <a href="http://sparna.fr" target="_blank">Sparna</a>
      	&nbsp;|&nbsp;
      	<a rel="license" href="http://creativecommons.org/licenses/by-sa/3.0/deed.fr"><img alt="Licence Creative Commons" style="border-width:0" src="http://i.creativecommons.org/l/by-sa/3.0/88x31.png" /></a>
      	</footer>
	</body>
</html>