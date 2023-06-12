
        <script>

        import image1 from "../assets/imagenes/clientes/persona1.jpeg"
        import image2 from "../assets/imagenes/clientes/persona2.jpg"
        import image3 from "../assets/imagenes/clientes/persona3.jpeg"
        import ClientesCard from "./ClientesCard.svelte"

      



        </script> 
        
       
        <main>
                  
          <div class="card">
    
            <h1>Registro de clientes</h1>
            
            <div class="cliente-1">
              <h2>Informacion personal</h2>
              <h2>Informacion de facturacion</h2>
              
              <ClientesCard   imagen={image1} 
                             name="Nelly Dominguez" 
                             birthDate="18/09/1983"
                             idCard="34567854G"
                             telNumber="698675345"
                             email="nelly.dom@gmail.com" 
                             address="Av/Diagonal 124, Barcelona"
                             startDate="12/05/2021"
                             renovationDate="23/12/2022" 
                             billingDate="05/07/2023" 
                             endDate="23/12/2023" 
                             paymentType="visa" 
                             subscriptionType="Anual"/>
                            
                            
               <div class="cliente-2">
                <h2>Informacion personal</h2>
                <h2>Informacion de facturacion</h2>
             <ClientesCard  imagen={image2} name="Manuel Rodrigues"
                            birthDate="01/12/1995" idCard="323443256F" telNumber="6781254365" email="manu.rod@gmail.com" address="C/Valencia 45, Barcelona" 
                             startDate="16/05/2023" renovationDate="16/08/2023" billingDate="05/07/2023" endDate="16/08/2023" paymentType="visa" subscriptionType="Mensual"/>
    
              <div class="clinete-3">     
                <h2>Informacion personal</h2>
                <h2>Informacion de facturacion</h2>    
    
               <ClientesCard imagen={image3} name="Federico Martinez" 
                            birthDate="24/11/1993" idCard="45665478K" telNumber="695456098" email="fed.martm@gmail.com"m address=" C/Mallorca 226, Barcelona"
                             startDate="08/10/2022" renovationDate="08/10/2023" billingDate="05/07/2023" endDate="08/10/20233" paymentType="visa" subscriptionType="Anual"/>
    
              
    
              
    
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
