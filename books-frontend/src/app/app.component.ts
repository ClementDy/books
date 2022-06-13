import { Component, OnInit } from '@angular/core';
import { Book } from './models/book.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'books-frontend';
  
  book !: Book;
  myBooks!: Book[];


  ngOnInit(): void {
    this.book = new Book("Mon Livre à moi");
    
    this.myBooks = [
      { 
        title : 'L\'art de la vitctoire'}
      ,
      { 
        title : 'L\'intelligence du coeur'}
    ];
  }
}
