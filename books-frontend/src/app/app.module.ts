import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import { MyBooksComponent } from './my-books/my-books.component';
import { MyReadsComponent } from './my-reads/my-reads.component';
import { BookComponent } from './book/book.component';

@NgModule({
  declarations: [
    AppComponent,
    TopBarComponent,
    MyBooksComponent,
    MyReadsComponent,
    BookComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
