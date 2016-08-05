# Notes-MVP
A sample note taking application to get a better understanding of MVP.

## Description

This is a simple note taking app that built on MVP architecture. I'm trying to learn the structure so I wanted to create this sample app and learning it by doing it. 
Anyone can copy and use all the codes.

### Part-1

In the first part of my sample app I have the following 6 Java Classes and 1 xml-layout:

- MainActivity.java
- NotesView.java
- NotePresenter.java
- NotePresenterImplement.java
- GetNotesInteraction.java
- GetNotesInteractionImplement.java

- activity_main.xml

#### Let's get started!

**MainActivity**

MainActivity is the activity that is hosting the layout. 
It _implements_ NotesView for updating the _layout_ and AdapterView.OnItemClickListener to _handle clicks_ on list items.

It has a field called notePresenter in the type of NotePresenterImplement, the reason that it has this field is to pass the triggered event by interacting with the _View_, to the _Presenter_ since handling those events are the job of the _Presenter_ for the sake of seperation of concerns. Later on we'll talk about it again.

**NotesView**

It belongs to the _View Layer_ in the MVP design pattern.

This is the interface that has only the decleration of the methods that will manipulate the view(layout). _View_'s methods are implemented in the activity that hosts the layout that is desired to be manipulated by this _View_.

So in this case, NotesView has the methods to manipulate ListItem which is in the activity_main.xml layout and MainActivity is the activity that hosts this layout. So that the NotesView will be implemented by MainActivity.



**NotePresenter**

Belongs to _Presenter Layer_ in the MVP design pattern.

This is an interface that will handle the interactions with UI(_View Layer_).

**Important!** The _Presenter_ interface of a view must contain a method for all the possible interaction with the _View_. If we consider the _Presenter_ is the layer that would handle all the interactions it must have all the methods to do so.

**NotePresenterImplement**

Belongs to the _Presenter Layer_.

This class implements the NotePresenter interface as expected. And this class has the methods that are designed such that they will update the view when they called by using the parameters they're given.

For the proper use of this presenters their methods will be called when a UI-related event is fired.

In our case, getting to the onResume state, requires to loadItems so we in MVC we do this in the activity but in MVP - since _Presenter Layer_ is deciding what to show and what not to - we'll call the relevant method of the presenter as such : notePresenter.onResume().

Another example from our case, when an item is clicked in MVC pattern we'd handle this situation directly by overriding the onClick method of ArrayAdapter but in MVP we rather call the notePresenter.onItem(position) by passing the position as the parameter and let this guy handle it.

**GetNotesInteraction**

Belongs to _Presenter Layer_ in the MVP design pattern again.

This interface has the method called "getNotesFromModel()" - which gets the data directly in the class its implemented - and another interface called "OnGetNotesFromModel" which has a method "onGetNotes(List<> notes)". This just creates the template for the GetNotesInteractionImplement class.

**GetNotesInteractionImplement**

In this class we implement the methods such that, when the getNotesFromModel() call is made it will get the arrayList inside the class and pass it to the OnGetNotesFromModel classes onGetNotes method. This class can be tought as an agent of _Presenter_ to handle the job getting the items and passing it to _presenter_ it's implemented.

In this case, the getNotesFromModel() is called inside the onResume method of _NotePresenterImplement_ and since GetNotesInteractionImplement implements the interface GetNotesInteraction the call will respond as the way it's implemented in _this_ class.


This is kinda documentation that I wrote to my futureself to be able to review this topic in my own words. I'll try to improve this project and add more documents when I have the time.

I really want to thank [Antoino Leiva](http://antonioleiva.com/mvp-android) for his amazing post. That I strongly inspired by his project that he mentioned in his great article! Thank you so much.