import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({
    providedIn: "root"
})
export class QueryProcessorService {
    constructor(
        private http: HttpClient
    ) { }
    processQuery(query: any, message: any): Observable<any> {
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json',
              'Access-Control-Allow-Origin': '*'
            })
          };
        console.log("test");
        return this.http.get('http://localhost:8080/aotinterview/processquery?query='+query + '&message='+ message,httpOptions);
    }
}