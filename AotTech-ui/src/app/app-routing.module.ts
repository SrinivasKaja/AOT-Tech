import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { QueryProcessorComponent } from './components/query-processor/query-processor.component';


const routes: Routes = [{
  path: "queryprocessing", component: QueryProcessorComponent
}, { path: "**", redirectTo: "/"}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
