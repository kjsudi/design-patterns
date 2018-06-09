# Strategy Design Pattern


Strategy pattern lets the algorithm vary independently from clients that use it.

Let me explain that through the example provided here:

Suppose we have a client whose requirement is to be able to search for something on the Internet through a Browser ( from the address bar to be precise ).
A browser could have different configurable properties such as enabling/disabling cookies, clearing history, changing the default search engine used, etc.
Here , configuring the search engine ( which itself is configurable ) is exemplified.

A default search Engine is used at first to process user's input. If the user is unhappy with the results, he could change the search engine to be used for later searches.
A user could also change the search engine's behavior, say searching in advanced mode ( exemplified here )

The search engine's behavior here does not make use of the strategy pattern, although that would best fit in here.
