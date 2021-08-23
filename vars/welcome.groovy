def call(){
    node {
    stage('checkout') {
       
            echo "Checkout"
    }
    stage('code coverage') {
       
            echo "Code coverage"     
    }
    stage('Archiving Artifacts') {
       
          echo "Archiving Artifacts"
  }
  stage('build') {
       
         echo "Build"
  }
  stage('Package') {
       
         echo "Package"
         
  }
  stage('Deploy') {
      
          echo "Deploy"
  } 
 
  
   
}
    
}
