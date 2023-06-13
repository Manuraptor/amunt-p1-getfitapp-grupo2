<script>
  import image1 from "../assets/imagenes/clientes/persona1.jpeg";
  import image2 from "../assets/imagenes/clientes/persona2.jpg";
  import image3 from "../assets/imagenes/clientes/persona3.jpeg";
  import ClientesCard from "./ClientesCard.svelte";

  ClientesCard;
</script>

<main>
  <h1 style="color: white;">Registro de clientes</h1>

  <div class="container">
    <div class="card-1">
      <ClientesCard
        imagen={image1}
        name="Nelly Dominguez"
        birthDate="Fecha de nacimiento: 18/09/1983"
        title="Informacion personal"
        idCard="DNI: 34567854G"
        telNumber="Telefono: 698675345"
        email="Email: nelly.dom@gmail.com"
        address="Direccion: Av/Diagonal 124, Barcelona"
        protectData="Aceptacion LOPD"
        text="Informacion de facturacion"
        startDate="Fecha de inicio: 12/05/2021"
        renovationDate="Fecha de renovacion: 23/12/2022"
        billingDate="Fecha de facturacion: 05/07/2023"
        endDate="Fecha de baja: 23/12/2023"
        paymentType="Forma de pago:"
        subscriptionType="Tipo de suscripcion: Anual"
      />

      <div class="card-2">
        <ClientesCard
          imagen={image2}
          name="Manuel Rodrigues"
          birthDate="Fecha de nacimiento: 01/12/1995"
          title="Informacion personal"
          idCard="DNI: 323443256F"
          telNumber="Telefono: 6781254365"
          email="Email: manu.rod@gmail.com"
          address="Direccion: C/Valencia 45, Barcelona"
          protectData="Aceptacion LOPD"
          text="Informacion de facturacion"
          startDate="Fecha de inicio: 16/05/2023"
          renovationDate="Fecha de renovacion: 16/08/2023"
          billingDate="Fecha de facturacion: 05/07/2023"
          endDate="Fecha de fin: 16/08/2023"
          paymentType="Forma de pago:"
          subscriptionType="Tipo de suscripcion: Mensual"
        />

        <div class="card-3">
          <ClientesCard
            imagen={image3}
            name="Federico Martinez"
            title="Informacion personal"
            birthDate="Fecha de nacimiento: 24/11/1993"
            idCard="DNI: 45665478K"
            telNumber="Telefono: 695456098"
            email="Email: fed.martm@gmail.com"
            address=" Direccion: C/Mallorca 226, Barcelona"
            protectData="Aceptacion LOPD"
            text="Informacion de facturacion"
            startDate="Fecha de inicio: 08/10/2022"
            renovationDate="Fecha de renovacion: 08/10/2023"
            billingDate="Fecha de facturacion: 05/07/2023"
            endDate="Fecha de fin: 08/10/20233"
            paymentType="Forma de pago:"
            subscriptionType="Tipo de suscripcion: Anual"
          />
        </div>
      </div>
    </div>
  </div>
</main>

<style>
  main {
    background-color: rgb(245, 246, 248)
  }
  h1 {
    margin-top: 20px;
    text-align: center;
    background-color: #0bcbf6;
    padding: 10px;
    width: 40%;
    font-size:large;
    margin-left: 30%;
    border-radius: 10px;
  }

 
</style>
