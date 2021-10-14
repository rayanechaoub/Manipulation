<?php
$mt=$_GET['mt'];
$clientSOAP = new SoapClient("http://localhost:8686/?wsdl");
$param= new stdClass();
$param->mt=$mt;
$res=$clientSOAP->__soapCall("convertir", array($param));
 ?>

 <html>
 <form action="phpClient.php" method="get">
     <input type="text" name="mt"> </input>
     <button> Convertir </button>
     </form>
 <?php echo "Le resultat renvoye par le service est $res->return "; ?>
 </html>