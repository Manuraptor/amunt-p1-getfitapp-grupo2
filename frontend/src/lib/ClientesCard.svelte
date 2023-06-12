<script>
 
  export let imagen
  export let name
  export let birthDate
  export let idCard
  export let telNumber
  export let email
  export let address
  export let startDate
  export let renovationDate
  export let billingDate
  export let endDate
  export let paymentType
  export let subscriptionType


    </script>
    
       
    <main>

      <div class="conteiner">

               
        <div class="cliente">
          <img src={imagen}>
        
            <h2>{name}</h2>
          </div>

          <div class="personal">
             <p>{birthDate}</p>
            <p>{idCard}</p>
            <p>{telNumber}</p>
            <p>{email}</p>
            <p>{address}</p>
          </div>

          <div class="billing">
            <p>{startDate}</p>
            <p>{renovationDate}</p>
            <p>{billingDate}</p>
            <p>{endDate}</p>
            <p>{paymentType}</p>
            <p>{subscriptionType}</p>

          </div>

          </div>

      
    </main>

    <style>
     .container{

      display: flex;
     }
    </style>