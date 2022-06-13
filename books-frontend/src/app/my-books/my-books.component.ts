import { Component, OnInit } from '@angular/core';
import { Book } from '../models/book.model';

@Component({
  selector: 'app-my-books',
  templateUrl: './my-books.component.html',
  styleUrls: ['./my-books.component.scss']
})
export class MyBooksComponent implements OnInit {

  myBooks!: Book[];


  ngOnInit(): void {
    this.myBooks = [
      { 
        title : 'L\'art de la vitctoire'
      },
      { 
        title : 'L\'intelligence du coeur'
      },
      { 
        title : 'L\'intelligence du coeur'
      },
      { 
        title : 'L\'intelligence du coeur'
      }
    ];
  }

}
