import {Data} from "@angular/router";

export class Category {

  id: number;
  name: string;
  data_created: Date;
  data_updated: Date;

  constructor(id: number, name: string, data_created: Date, data_updated: Date) {
    this.id = id;
    this.name = name;
    this.data_created = data_created;
    this.data_updated = data_updated;
  }
}
