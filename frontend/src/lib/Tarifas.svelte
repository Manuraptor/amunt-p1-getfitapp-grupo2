<script lang="ts">
    import {
     
      Card,
      CardBody,
      
      CardHeader,
      CardSubtitle,
      CardText,
      CardTitle
    } from 'sveltestrap';
  </script>
  <main>

    <h1>Tarifas GetfitEasy</h1>
    
  <div class="card-container">

    <Card body color="info" class="mb-3">
    <CardHeader>
      <CardTitle><p class="header">Suscripción Mensual</p></CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle><p class="title">Horario mañana</p> </CardSubtitle>
      <CardText>  
        <p>Lunes-Sabado</p>
        <p> Desde 9:00h-13:00h</p>
        <p class="price"> 19.99€/mes</p> 
      <p class="oferta">¡TARIFA REDUCIDA!</p>  </CardText>
       
    </CardBody>
    
  </Card>

  <Card body color="info" class="mb-3">
    <CardHeader>
      <CardTitle><p class="header">Suscripción Anual</p></CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle><p class="title">Horario todo el dia</p> </CardSubtitle>
      <CardText>
        <p>Lunes-Sabado</p>
        <p> Desde 9:00h-21:00h</p>
        <p class="price"> 120€/año</p> 
       
      </CardText>
      
     
    </CardBody>
   
  </Card>
 
  <Card body color="info" class="mb-3">
 
    <CardHeader>
      <CardTitle><p class="header">Entrenador Personal</p></CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle><p class="title">Horario personalizado</p></CardSubtitle>
      <CardText>
        <p>Lunes-Sabado</p>
        <p> Desde 9:00h-21:00h</p>
        <p class="price"> 142.67€/mes</p> 
      </CardText>
      
     
    </CardBody>
    
  </Card>

  <Card body color="info" class="mb-3">
    <CardHeader>
      <CardTitle><p class="header">Clases de Natación</p></CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle><p class="title">Horario mañana</p></CardSubtitle>
      <CardText>
        <p>Lunes-Sabado</p>
        <p> Desde 9:00h-13:00h</p>
        <p class="price"> 56€/mes</p>
      </CardText>
      
    </CardBody>
    
  </Card>

</div>

</main>

<style>
    .card-container {
    display: grid;
    grid-template-columns: repeat(4, 1fr);
    gap: 20px;
    padding: 60px;
    padding-top: 70px;

  }

 p{
  /*color: rgb(229, 229, 238);*/
   font-size: x-large;
   color:yellow;
 }

 .price{
  font-size: xxx-large;
  ;
  color: green;
 }

 h1{
  text-align: center;
  padding-top: 30px;
  font-size:xxx-large;
  color: green;

 }

 .title{
  color: yellow;
 }
  
.oferta{
  color: red;
}
.header {
  color: green;
}

</style>