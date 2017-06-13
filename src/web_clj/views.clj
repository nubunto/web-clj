(ns web-clj.views
  (:require [hiccup.core :refer [html]]))

(defn welcome-page
  [req]
  (html
    [:main
     [:h1 "hello world!"]
     [:p "some text after"]]))
