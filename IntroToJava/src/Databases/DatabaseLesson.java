package Databases;

// What is a Database?
// - an organized collection of data
// - planing stage of database is the most important part of the database
// - relational databases: each item of data that you are storing has a relation to each other

// What is SQL?
// - programing language
// - used in programming and managing relational databases

// SQL has four main commands
// SELECT, INSERT, UPDATE, DELETE

// ER Diagram
// - visual representation of data model
// when creating ER diagram we have
// ENTITIES: objects, what you are storing (ex. student). Every entity has primary key (unique identifier)\
//          - singular noun
// ATTRIBUTES: information on the object (ex. student id)
//          - directly refers to an entity
// RELATIONSHIPS: a meaningful association between entities. Usually verbs in the present tense.
// Keys : an attribute or collection of attributes that uniquely identifies an entity

// Student
// - student ID
// - Name
// - email
// - DOB

// Courses
// - name
// - description
// - credits
// - course id

// Program
// - program id
// - name


// STEPS TO FOLLOW FOR ER DIAGRAM
// 1. understand the case study requirements
// 2. write down business rules (rules on how data connects)
// 3. Identify entities (do this, so you have chance to remove any duplicates)
// 4. define the attributes for each entity
// 5. choose a primary key***
// 6. establish the relationships
// 7. describe the cardinality strengths
// 8. remove any duplicate relationships


// create an ER diagram that keeps track of which person is song author
// - a person can author many songs and a song has exactly one author
// - need to keep track of which people performed on an album
// - keep track of which songs are included on an album

// Person                                 Song                                            Album
// - *Name*                               - *name*                                        - *name*
// - DOB        --|-- creates --<--       - lyrics        --|-- part of --<--             - tracklist
// - POB                                  - beat

// Album                                                    Person
// - *name*                                                 - *Name*
// - tracklist          -->-- performed by --<--            - DOB
//                                                          - POB

// KEY
// --|-- one
// --<-- many
// *alsdk* underlined (primary key)

// Song
// - name
// - lyrics
// - beat

// Album
// - name
// - tracklist (song position) idk)?

public class DatabaseLesson {
}
