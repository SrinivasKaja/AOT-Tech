import { Component, Input, OnInit, Output } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Alert } from 'src/app/models/Alert';
import { AlertService } from 'src/app/services/alert.service';
import { QueryProcessorService } from 'src/app/services/query-processor.service';
@Component({
  selector: 'app-query-processor',
  templateUrl: './query-processor.component.html',
  styleUrls: ['./query-processor.component.css']
})
export class QueryProcessorComponent implements OnInit {
  alert: Alert = new Alert();
  queryProcessorForm: FormGroup;
  queryError: false;
  messageError: false;
  @Input() query:string;
  @Input() message: string;
  @Output() result: any;
  constructor(private queryProcessorService: QueryProcessorService,
    private alertService: AlertService) { }

  ngOnInit(): void {
    this.queryProcessorForm = new FormGroup({
      query: new FormControl("",Validators.required),
      message: new FormControl("", Validators.required),
      result: new FormControl("")
    });
  }
 
search() {
  console.log("insdfdsf", this.queryProcessorForm.value.query)
  console.log("insdfdsf", this.queryProcessorForm)
  const query = this.queryProcessorForm.value.query;
  const message = this.queryProcessorForm.value.message;
if (query !=null && message !=null) {
  const data = {
    query : query,
    message: message
  }
this.queryProcessorService.processQuery(query, message).subscribe((response) => {
console.log("response", response);
this.queryProcessorForm.value.result = response.item;
})
}
}
}
