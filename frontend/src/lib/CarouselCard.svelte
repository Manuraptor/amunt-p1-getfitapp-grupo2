<script>
    export let image;
    export let currentIndex
  
    let images = [
    'image1.jpg',
    'image2.jpg',
    'image3.jpg',
    'image4.jpg'
  ];
 

    
  </script>
  
  

  <div class="carousel">
    {#each images as image, i (image)}
      <img class="slide {i === currentIndex ? 'active' : ''}" src={image} alt="Slide" />
    {/each}
  </div>

  <style>
    .carousel {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 300px;
      overflow: hidden;
    }
  
    .slide {
      width: 100%;
      height: 100%;
      object-fit: cover;
      transition: transform 0.5s ease;
    }
  </style>