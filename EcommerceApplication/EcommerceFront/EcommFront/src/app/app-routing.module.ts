import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { AddAutomobileComponent } from './components/add-automobile/add-automobile.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { UserDashboardComponent } from './components/user-dashboard/user-dashboard.component';
import { UserLoginComponent } from './components/user-login/user-login.component';
import { UsercartComponent } from './components/usercart/usercart.component';

const routes: Routes = [

  {
    path:'',
    component:HomeComponent,
    pathMatch:'full'
  },
  {
    path:'adminlogin',
    component:LoginComponent,
    pathMatch:'full'
  }
  ,
  {
    path:'dashboard',
    component:DashboardComponent,
    pathMatch:'full',
    canActivate:[AuthGuard]
  },
  {
    path:'addAuto',
    component:AddAutomobileComponent,
    pathMatch:'full',
    canActivate:[AuthGuard]
  },
  {
    path:'userlogin',
    component:UserLoginComponent,
    pathMatch:'full'
  },
  {
    path:'userdashboard',
    component:UserDashboardComponent,
    pathMatch:'full',
    canActivate:[AuthGuard]
  },
  {
    path:'usercart',
    component:UsercartComponent,
    pathMatch:'full',
    canActivate:[AuthGuard]
  },
  {
    path:'register',
    component:RegisterComponent,
    pathMatch:'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
