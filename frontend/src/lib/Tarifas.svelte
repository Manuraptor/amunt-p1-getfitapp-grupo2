<script lang="ts">
    import {
     
      Card,
      CardBody,
      CardFooter,
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
      <CardTitle><p>Suscripción Mensual</p></CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle>Horario mañana </CardSubtitle>
      <CardText>  
        <p>Lunes-Sabado</p>
        <p> Desde 9:00h-13:00h</p>
        <p class="price"> 19.99€/mes</p>   </CardText>
        <CardFooter></CardFooter>
      
    </CardBody>
    
  </Card>

  <Card body color="info" class=card>
    <CardHeader>
      <CardTitle><p>Suscripción Anual</p></CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle> Horario todo el dia</CardSubtitle>
      <CardText>
        <p>Lunes-Sabado</p>
        <p> Desde 9:00h-21:00h</p>
        <p class="price"> 120€/año</p> 
       
      </CardText>
      
      <CardFooter></CardFooter>
    </CardBody>
   
  </Card>
  <Card body color="info" class=card>
 
    <CardHeader>
      <CardTitle><p>Entrenador Personal</p></CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle>Horario personalizado</CardSubtitle>
      <CardText>
        <p>Lunes-Sabado</p>
        <p> Desde 9:00h-21:00h</p>
        <p class="price"> 142.67€/mes</p> 
      </CardText>
      
      <CardFooter></CardFooter>
    </CardBody>
    
  </Card>

  <Card body color="info" class=card>
    <CardHeader>
      <CardTitle><p>Clases de Natación</p></CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle>Horario mañana</CardSubtitle>
      <CardText>
        <p>Lunes-Sabado</p>
        <p> Desde 9:00h-13:00h</p>
        <p class="price"> 56€/mes</p>
      </CardText>
      <CardFooter></CardFooter>
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
  color: rgb(229, 229, 238);
 }

 .price{
  font-size: larger;
  ;
  color: rgb(26, 26, 218);
 }

 h1{
  text-align: center;
  padding-top: 30px;
  font-size:large;
  color: green;

 }
</style>