import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { Routes } from '@angular/router';

const ROUTES: Routes = [
  { path : 'home', component:HomeComponent},
  { path : 'contact', component:ContactComponent},
  { path : 'about',component:AboutComponent},

];
@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
    
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
