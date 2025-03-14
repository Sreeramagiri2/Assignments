const images = [
  "/DOM/assets/img1.png",
  "/DOM/assets/img2.png",
  "/DOM/assets/img3.png"
];

let currentIndex = 0;

// Function to show the image based on index
function showImage(index) {
  const sliderImage = document.getElementById("sliderImage");
  if (index >= 0 && index < images.length) {
    sliderImage.src = images[index];
  }
}

// Function to go to the previous image
function prevImage() {
  currentIndex = (currentIndex - 1 + images.length) % images.length;
  showImage(currentIndex);
}

// Function to go to the next image
function nextImage() {
  currentIndex = (currentIndex + 1) % images.length;
  showImage(currentIndex);
}

// Display the first image initially
showImage(currentIndex);
