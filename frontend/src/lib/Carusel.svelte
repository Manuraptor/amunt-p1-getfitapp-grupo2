<script>
  import { onMount, onDestroy } from 'svelte';
  

  let images = [
    'image1.jpg',
    'image2.jpg',
    'image3.jpg',
    'image4.jpg'
  ];
 

  let currentIndex = 0;
  let intervalId = null;

  function startAutoplay() {
    intervalId = setInterval(() => {
      nextSlide();
    }, 3000);
  }

  function stopAutoplay() {
    clearInterval(intervalId);
  }

  function nextSlide() {
    currentIndex = (currentIndex + 1) % images.length;
  }

  onMount(() => {
    startAutoplay();
  });

  onDestroy(() => {
    stopAutoplay();
  });
</script>


<div class="carousel">
  {#each images as image (image)}
    <CaruselCard image={image} />
  {/each}
</div>






