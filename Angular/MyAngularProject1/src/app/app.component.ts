import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name:string;
  age:number;
  email:string;
  imagePath:string;

  constructor(){
    this.name="Agila";
    this.age=20;
    this.email="agila@gmail.com";
    this.imagePath="./assets/Ang1.png";
  }
  change(){
    this.name="vijay";
  }
  changeImage(){
    this.imagePath="./assets/Ang1.png";
  }
}
