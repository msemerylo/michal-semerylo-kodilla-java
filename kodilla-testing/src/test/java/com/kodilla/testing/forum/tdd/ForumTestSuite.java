package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;
@DisplayName("TDD: Forum Test Suite \uD83D\uDE31")
class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTestos() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Test of posts")
    class TestPosts {
        @Test
        void testAddPost() {
            //given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            //when
            forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here!");
            //then
            Assertions.assertEquals(1, forumUser.getPostsQuanitity());
        }

        @Test
        void testGetPost() {
            //given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");

            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //when
            ForumPost retrivedPost;
            retrivedPost = forumUser.getPost(0);
            //then
            Assertions.assertEquals(thePost, retrivedPost);
        }

        @Test
        void testRemovePostNotExisting() {
            //given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            //when
            boolean result = forumUser.removePost(thePost);
            //then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemovePost() {
            //given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //when
            boolean result = forumUser.removePost(thePost);
            //then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostsQuanitity());
        }
    }
    @Nested
    @DisplayName("Test of comments")
    class TestComments {

        @Test
        void testAddComment() {
            //given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            //when
            forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");
            //then
            Assertions.assertEquals(1, forumUser.getCommentsQuanitity());
        }

        @Test
        void testGetComment() {
            //given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
            //when
            ForumComment retrivedComment = forumUser.getComment(0);
            //then
            Assertions.assertEquals(theComment, retrivedComment);
        }

        @Test
        void testRemoveComment() {
            //given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
            //when
            boolean result = forumUser.removeComment(theComment);

            //then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostsQuanitity());
        }
        @Test
        void testRemoveCommentNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith",
                    "Thank you for all good words!");

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertFalse(result);
        }
    }
}
