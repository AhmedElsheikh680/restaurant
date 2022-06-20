import { Component, OnInit } from '@angular/core';
import {OrderServiceService} from "../../service/order-service.service";
import {Order} from "../../model/order";

@Component({
  selector: 'app-order-items',
  templateUrl: './order-items.component.html',
  styleUrls: ['./order-items.component.css']
})
export class OrderItemsComponent implements OnInit {

  constructor(private orderService: OrderServiceService) { }
  orders: Order[]=[];

  ngOnInit(): void {
    this.getOrders()
  }
  getOrders() {
    this.orderService.getOrders().subscribe(
      data => {
        this.orders = data
      }
    )
  }

}
