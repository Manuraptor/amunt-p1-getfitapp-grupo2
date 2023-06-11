<script>
  export let title
  export let imagen
  export let customer;
  export let name;
  export let birthDate;
  export let idCard;
  export let telNumber;
  export let email;
  export let address;
  export let startDate;
  export let renovationDate;
  export let billingDate;
  export let endDate;
  export let paymentType;
  export let subscriptionType

  customer
    </script>
    
       
    <main>

      <div class="conteiner">

               
        <div class="customer">
          <img src={imagen}>
        
            <h2>{name}</h2>
          </div>

          <div class="personal">
            <h1>{title}</h1>
            <p>{birthDate}</p>
            <p>{idCard}</p>
            <p>{telNumber}</p>
            <p>{email}</p>
            <p>{address}</p>
          </div>

          <div class="billing">
            <h1>{title}</h1>
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
     
    </style>