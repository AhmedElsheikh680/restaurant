import {Data} from "@angular/router";

export class Order {

  id: number;
  name: string;
  data_created: Date;
  data_updated: Data;
  description: string;
  image: string;
  price: number;


  constructor(id: number, name: string, data_created: Date, data_updated: Data, description: string, image: string, price: number) {
    this.id = id;
    this.name = name;
    this.data_created = data_created;
    this.data_updated = data_updated;
    this.description = description;
    this.image = image;
    this.price = price;
  }
}
