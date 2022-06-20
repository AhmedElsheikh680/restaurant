import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {map, Observable} from "rxjs";
import {Order} from "../model/order";

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  constructor(private httpClient: HttpClient) { }
  private baseUrl= 'http://localhost:8080/api/v1/orders';

getOrders(): Observable<Order[]> {
  return this.httpClient.get<Order[]>(this.baseUrl).pipe(
    map(
      response => response
    )
  )
}

}
