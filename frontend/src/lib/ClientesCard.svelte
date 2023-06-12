<script>
  export let title
  export let text
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

      <div class="card">
               
        <div class="image">
          <img src={imagen}>
          <p>{name}</p>
                   
          </div>

          <div class="personal">
            <h2>{title}</h2>
            <p>{birthDate}</p>
            <p>{idCard}</p>
            <p>{telNumber}</p>
            <p>{email}</p>
            <p>{address}</p>
          </div>

          <div class="billing">
            <h2>{text}</h2>
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

      
    

     img{
      height: 80px;
      width: 80px;
     }
    </style>