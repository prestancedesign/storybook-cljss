(ns storyvite.core
  (:require
   [reagent.dom.client :refer [create-root]]
   [cljss.core :refer-macros [defstyles] :as css]
   [reagent.core :as r]))

;; -------------------------
;; Views

(defstyles title [color]
  {:color color
   :padding "10px"
   :border (str "1px solid " color)})

(defstyles subtitle []
  {:color "blue"})

(defn home-page []
  [:div
   [:h1 {:class (title "red")} "Welcome to Reagent"]
   [:h2 {:class (subtitle)} "Subtitle"]
   [:p "Fusce sagittis, libero non molestie mollis, magna orci ultrices dolor, at vulputate neque nulla lacinia eros."]])

;; -------------------------
;; Initialize app

(defn clean []
  (css/remove-styles!))

(defn mount-root []
  (let [root (create-root (.getElementById js/document "app"))]
    (.render root (r/as-element [home-page]))))

(defn ^:export init! []
  (mount-root))
