
        <script>

        import image1 from "../assets/imagenes/clientes/persona1.jpeg";
        import image2 from "../assets/imagenes/clientes/persona2.jpg";
        import image3 from "../assets/imagenes/clientes/persona3.jpeg";
        import Clientes from "./ClientesCard.svelte";
        
Clientes


        </script> 
        
       
        <main>
                  
          <div class="card">
    
            <h1>Registro de clientes</h1>
            
            <div class="customer-1">
              customerCard1 imagen={image1} name="Nelly Dominguez" 
                             title="Informacion personal" birthDate="18/09/1983" idCard="34567854G" telNumber="698675345" email="nelly.dom@gmail.com" address="Av/Diagonal 124, Barcelona
                             title="Informacion de facturacion" startDate="12/05/2021" renovationDate="23/12/2022" billingDate="05/07/2023" endDate="23/12/2023" paymentType="visa" subscriptionType="Anual"
                            </div>
                            
               <div class="customer-2">
              customerCard2=imagen={image2} name="Manuel Rodrigues"
                            title="Informacion personal" birthDate="01/12/1995" idCard="323443256F" telNumber="6781254365" email="manu.rod@gmail.com" address="C/Valencia 45, Barcelona" 
                            title="Informacion de facturacion" startDate="16/05/2023" renovationDate="16/08/2023" billingDate="05/07/2023" endDate="16/08/2023" paymentType="visa" subscriptionType="Mensual"
    </div>
              <div class="customer-1">         
    
              customerCard3=imagen={image3} name="Federico Martinez" 
                            title="Informacion personal" birthDate="24/11/1993" idCard="45665478K" telNumber="695456098" email="fed.martm@gmail.com"m address=" C/Mallorca 226, Barcelona"
                            title="Informacion de facturacion" startDate="08/10/2022" renovationDate="08/10/2023" billingDate="05/07/2023" endDate="08/10/20233" paymentType="visa" subscriptionType="Anual"
    
              
    
              </div>
    
              </div>
    
          
    
    </main>
            
            
        
          <style>
        
        .card{
        width: 90%;
        display: flex;
        align-items: center;
        flex-direction: column;
       }   
       
       
   </style>
